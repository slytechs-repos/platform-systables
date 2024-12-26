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

import java.nio.file.Path;
import java.util.Optional;

import com.slytechs.jnet.platform.api.common.NotFound;

/**
 * Interface providing access to various platform dependent system tables. This
 * is useful when writing network code and access to arp, routing, etc are
 * needed.
 * 
 * @author Mark Bednarczyk
 */
public interface SystemTable<T> {

	Optional<String> name();

	Optional<String> description();

	Optional<Path> path();

	boolean contains(T t);

	Optional<T> find();

	T get() throws NotFound;

	boolean add(T t);

	boolean set(T t);

	boolean remove(T t) throws NotFound;

	boolean disable(T t) throws NotFound;
}
