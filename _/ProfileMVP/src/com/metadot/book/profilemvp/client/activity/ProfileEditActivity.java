/** 
 * Copyright 2010 Daniel Guermeur and Amy Unruh
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   See http://connectrapp.appspot.com/ for a demo, and links to more information 
 *   about this app and the book that it accompanies.
 */
package com.metadot.book.profilemvp.client.activity;

import com.metadot.book.profilemvp.client.BrowserFactory;
import com.metadot.book.profilemvp.client.place.ProfileEditPlace;
import com.metadot.book.profilemvp.client.ui.ProfileEditView;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ProfileEditActivity extends AbstractActivity implements ProfileEditView.Presenter {
	private BrowserFactory browserFactory;
	private String name;

	public ProfileEditActivity(ProfileEditPlace place, BrowserFactory browserFactory) {
		this.name = place.getName();
		this.browserFactory = browserFactory;
	}

	/**
	 * Invoked by the ActivityManager to start a new Activity
	 */
	@Override public void start(AcceptsOneWidget container, EventBus eventBus) {
		ProfileEditView editView = browserFactory.getProfileEditView();
		editView.setName(name);
		editView.setPresenter(this);
		container.setWidget(editView.asWidget());
	}

	@Override public void goTo(Place place) {
		browserFactory.getPlaceController().goTo(place);
	}
}