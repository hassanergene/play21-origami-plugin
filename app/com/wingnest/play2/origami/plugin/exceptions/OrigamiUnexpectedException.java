/*
 * Copyright since 2013 Shigeru GOUGI
 *                              e-mail:  sgougi@gmail.com
 *                              twitter: @igerugo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wingnest.play2.origami.plugin.exceptions;

import play.api.UnexpectedException;
import scala.Option;

public class OrigamiUnexpectedException extends UnexpectedException {

	public OrigamiUnexpectedException(final Exception e) {
		super(Option.apply(e.getMessage()), Option.apply(e.getCause()));
	}

	private static final long serialVersionUID = 1L;

}