/*
 * Sly Technologies Free License
 * 
 * Copyright 2023 Sly Technologies Inc.
 *
 * Licensed under the Sly Technologies Free License (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.slytechs.com/free-license-text
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.slytechs.jnet.platform.systables;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

import com.slytechs.jnet.platform.api.common.NotFound;

/**
 * Inteface providing various asynchronous resolution services such as DNS or
 * name resolution, etc. The implementation uses native services to perform the
 * resolutions.
 *
 * @author Mark Bednarczyk
 * @param <T> the generic query object type
 */
public interface Resolver<T> {

	boolean isCached(T t);

	<R> R resolveCachedOrNotFound(T t) throws NotFound;

	<R, E extends Throwable> R resolveCachedOrThrow(T t, Supplier<E> exceptionSupplier) throws E;

	<R> R resolveCachedOrElse(T t, R elseValue);

	<R> Future<R> resolve(T t);

	@SuppressWarnings("unchecked")
	default <R> R resolve(T t, long timeout, TimeUnit unit) throws InterruptedException, TimeoutException {
		try {
			return (R) resolve(t).get(timeout, unit);
		} catch (ExecutionException e) {
			throw new TimeoutException();
		}
	}

	void clearCache();

}
