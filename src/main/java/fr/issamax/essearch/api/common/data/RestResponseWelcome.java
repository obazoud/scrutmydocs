/*
 * Licensed to David Pilato and Malloum Laya (the "Authors") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Authors licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package fr.issamax.essearch.api.common.data;

import fr.issamax.essearch.api.common.RestAPIException;
import fr.issamax.essearch.api.common.data.RestResponse;


public class RestResponseWelcome extends RestResponse<Welcome> {
	private static final long serialVersionUID = 1L;

	public RestResponseWelcome(Welcome doc) {
		super(doc);
	}

	public RestResponseWelcome() {
		super();
	}

	public RestResponseWelcome(RestAPIException e) {
		super(e);
	}
}