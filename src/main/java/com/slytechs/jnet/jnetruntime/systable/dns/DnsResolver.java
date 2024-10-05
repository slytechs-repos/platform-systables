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
package com.slytechs.jnet.jnetruntime.systable.dns;

import java.util.concurrent.Future;
import java.util.function.Supplier;

import com.slytechs.jnet.jnetruntime.NotFound;
import com.slytechs.jnet.jnetruntime.systable.Resolver;

/**
 * @author Mark Bednarczyk
 *
 */
public class DnsResolver implements Resolver<Object> {

	/**
	 * 
	 */
	public DnsResolver() {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.jnetruntime.systable.Resolver#clearCache()
	 */
	@Override
	public void clearCache() {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.jnetruntime.systable.Resolver#isCached(java.lang.Object)
	 */
	@Override
	public boolean isCached(Object t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.jnetruntime.systable.Resolver#resolveCachedOrNotFound(java.lang.Object)
	 */
	@Override
	public <R> R resolveCachedOrNotFound(Object t) throws NotFound {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.jnetruntime.systable.Resolver#resolveCachedOrThrow(java.lang.Object,
	 *      java.util.function.Supplier)
	 */
	@Override
	public <R, E extends Throwable> R resolveCachedOrThrow(Object t, Supplier<E> exceptionSupplier) throws E {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.jnetruntime.systable.Resolver#resolveCachedOrElse(java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public <R> R resolveCachedOrElse(Object t, R elseValue) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.jnetruntime.systable.Resolver#resolve(java.lang.Object)
	 */
	@Override
	public <R> Future<R> resolve(Object t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

}
