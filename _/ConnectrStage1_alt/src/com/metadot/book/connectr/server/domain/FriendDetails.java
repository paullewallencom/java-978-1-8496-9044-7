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
package com.metadot.book.connectr.server.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 */
@SuppressWarnings("serial")
public class FriendDetails implements Serializable {

   private String emailAddress;
   
   private Set<String> urls;
 

  public FriendDetails() {
    urls = new HashSet<String>();
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Set<String> getUrls() {
    return urls;
  }
  
  public void setUrls(Set<String> urls) {
    this.urls = urls;
  }
  
  public void addUrl(String url) {
    urls.add(url);
  }

  public void addUrls(Set<String> urls) {
    this.urls.addAll(urls);
  }

  public void removeUrls(Set<String> urls) {
    this.urls.removeAll(urls);
  }
  
}

