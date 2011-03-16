package com.julienvey.blog.gwtstuff.images.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ImagesStuff implements EntryPoint {

	public void onModuleLoad() {
		RootPanel root = RootPanel.get();
		VerticalPanel main = new VerticalPanel();
		root.add(main);
		main.setSpacing(2);

		/* Demo 1 */
		HorizontalPanel demo1 = new HorizontalPanel();
		main.add(demo1);
		demo1.setSpacing(2);

		Image largeImage = new Image(ImageResources.INSTANCE.zenika1Large());
		demo1.add(largeImage);

		Image smallImage = new Image(ImageResources.INSTANCE.zenika1Small());
		demo1.add(smallImage);

		/* Demo 2 */
		HorizontalPanel demo2 = new HorizontalPanel();
		main.add(demo2);
		demo2.setSpacing(2);

		Image large = new Image(ImageResources.INSTANCE.zenikaLarge());
		demo2.add(large);

		Image medium = new Image(ImageResources.INSTANCE.zenikaMedium());
		demo2.add(medium);

		Image small = new Image(ImageResources.INSTANCE.zenika1Small());
		demo2.add(small);

	}
}
