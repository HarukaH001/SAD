package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	private String name;

	NewsSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void onSubscribe(Subscription subscription) {
	}

	@Override
	public void onNext(News item) {
		System.out.printf("------------------\ncc: %s\nTopic: %s\n\n\t%s\n", this.name, item.getTopic(),
				item.getContent());
	}

	@Override
	public void onError(Throwable throwable) {
	}

	@Override
	public void onComplete() {
		System.out.printf("\n%s received\n------------------\n\n", this.name);
	}
}
