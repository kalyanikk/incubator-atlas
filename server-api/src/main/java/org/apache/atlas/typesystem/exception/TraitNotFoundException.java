/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.atlas.typesystem.exception;
import org.apache.atlas.AtlasException;

/**
 * A simple wrapper for  404.
 * Thrown when a requested trait can not be found.
 */
public class TraitNotFoundException extends AtlasException{
    public TraitNotFoundException() {
    }

    public TraitNotFoundException(String message) {
        super(message);
    }

    public TraitNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TraitNotFoundException(Throwable cause) {
        super(cause);
    }

    public TraitNotFoundException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
