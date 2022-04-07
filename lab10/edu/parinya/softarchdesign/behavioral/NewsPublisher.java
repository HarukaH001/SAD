package edu.parinya.softarchdesign.behavioral;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {
	private Set<NewsReader> subscribers;

	NewsPublisher() {
		this.subscribers = new LinkedHashSet<NewsReader>();
	}

	@Override
	public void subscribe(Subscriber<? super News> subscriber) {
		this.subscribers.add((NewsReader) subscriber);
	}

	public void publish(News news) {
		for (NewsReader subscriber : this.subscribers) {
			subscriber.onNext(news);
			subscriber.onComplete();
		}
	}
}
