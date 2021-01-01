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
package com.metadot.book.profilemvp.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.metadot.book.profilemvp.client.BrowserFactory;
import com.metadot.book.profilemvp.client.activity.ProfileActivity;
import com.metadot.book.profilemvp.client.activity.ProfileEditActivity;
import com.metadot.book.profilemvp.client.place.ProfileEditPlace;
import com.metadot.book.profilemvp.client.place.ProfilePlace;

public class AppActivityMapper implements ActivityMapper {

	private BrowserFactory browserFactory;

	/**
	 * AppActivityMapper associates each Place with its corresponding {@link Activity}
	 * 
	 * @param browserFactory
	 *            Factory to be passed to activities
	 */
	public AppActivityMapper(BrowserFactory browserFactory) {
		super();
		this.browserFactory = browserFactory;
	}

	/**
	 * Map each Place to its corresponding Activity. This would be a great use for GIN.
	 */
	@Override public Activity getActivity(Place place) {
		// This is begging for GIN
		if (place instanceof ProfilePlace)
			return new ProfileActivity((ProfilePlace) place, browserFactory);
		else if (place instanceof ProfileEditPlace)
			return new ProfileEditActivity((ProfileEditPlace) place, browserFactory);

		return null;
	}

}
