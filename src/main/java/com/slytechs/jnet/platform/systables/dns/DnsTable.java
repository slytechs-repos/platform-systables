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
package com.slytechs.jnet.platform.systables.dns;

import java.nio.file.Path;
import java.util.Optional;

import com.slytechs.jnet.platform.api.NotFound;
import com.slytechs.jnet.platform.systables.SystemTable;

/**
 * @author Mark Bednarczyk
 *
 */
public class DnsTable implements SystemTable<DnsRecord> {

	/**
	 * 
	 */
	public DnsTable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#name()
	 */
	@Override
	public Optional<String> name() {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#description()
	 */
	@Override
	public Optional<String> description() {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#path()
	 */
	@Override
	public Optional<Path> path() {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(DnsRecord t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#find()
	 */
	@Override
	public Optional<DnsRecord> find() {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#get()
	 */
	@Override
	public DnsRecord get() throws NotFound {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#add(java.lang.Object)
	 */
	@Override
	public boolean add(DnsRecord t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#set(java.lang.Object)
	 */
	@Override
	public boolean set(DnsRecord t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(DnsRecord t) throws NotFound {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.platform.api.systable.SystemTable#disable(java.lang.Object)
	 */
	@Override
	public boolean disable(DnsRecord t) throws NotFound {
		throw new UnsupportedOperationException("not implemented yet");
	}

}
