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
package com.metadot.book.profilemvp.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.metadot.book.profilemvp.client.ui.ProfileEditView;
import com.metadot.book.profilemvp.client.ui.ProfileEditViewImpl;
import com.metadot.book.profilemvp.client.ui.ProfileView;
import com.metadot.book.profilemvp.client.ui.ProfileViewMobileImpl;

public class BrowserFactoryMobileImpl implements BrowserFactory {
	private static final EventBus eventBus = new SimpleEventBus();
	private static final PlaceController placeController = new PlaceController(eventBus);
	private static final ProfileView profileView = new ProfileViewMobileImpl();
	private static final ProfileEditView profileEditView = new ProfileEditViewImpl();

	@Override public EventBus getEventBus() {
		return eventBus;
	}

	@Override public ProfileView getProfileView() {
		return profileView;
	}

	@Override public PlaceController getPlaceController() {
		return placeController;
	}

	@Override public ProfileEditView getProfileEditView() {
		return profileEditView;
	}

}
