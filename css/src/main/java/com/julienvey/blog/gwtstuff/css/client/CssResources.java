package com.julienvey.blog.gwtstuff.css.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public interface CssResources extends ClientBundle {

	public static final CssResources INSTANCE = GWT.create(CssResources.class);

	public static final String ROOT_DIR = "com/julienvey/blog/gwtstuff/images/public/";

	@Source(ROOT_DIR + "zenika1.png")
	ImageResource zenika1Large();

	@Source(ROOT_DIR + "zenika1-small.png")
	ImageResource zenika1Small();

	@Source(ROOT_DIR + "zenika1.png")
	@ImageOptions(height = 80, width = 128)
	ImageResource zenikaSmall();

	@Source(ROOT_DIR + "zenika1.png")
	@ImageOptions(height = 240, width = 384)
	ImageResource zenikaMedium();

	@Source(ROOT_DIR + "zenika1.png")
	@ImageOptions(height = 640, width = 1024)
	ImageResource zenikaLarge();

}