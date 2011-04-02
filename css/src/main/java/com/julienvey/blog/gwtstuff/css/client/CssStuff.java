package com.julienvey.blog.gwtstuff.css.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CssStuff implements EntryPoint {

	public void onModuleLoad() {
		RootPanel root = RootPanel.get();
		VerticalPanel panel = new VerticalPanel();
		root.add(panel);

		// Inject css into the dom
		Resources.INSTANCE.css().ensureInjected();

		/* Demo 1 */
		Label demo1Label = new Label("Demo 1");
		demo1Label.addStyleName(Resources.INSTANCE.css().demo1());
		panel.add(demo1Label);

		/* Demo 2 */
		Label demo2Label = new Label("Demo 2");
		demo2Label.addStyleName(Resources.INSTANCE.css().demo2());
		panel.add(demo2Label);

	}
}
