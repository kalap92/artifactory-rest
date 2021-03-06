/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cdancy.artifactory.rest.domain.docker;

import com.google.auto.value.AutoValue;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

@AutoValue
public abstract class PromoteImage {

   public abstract String targetRepo();

   public abstract String dockerRepository();

   @Nullable
   public abstract String tag();

   public abstract boolean copy();

   PromoteImage() {
   }

   @SerializedNames({ "targetRepo", "dockerRepository", "tag", "copy" })
   public static PromoteImage create(String targetRepo, String dockerRepository, String tag, boolean copy) {
      return new AutoValue_PromoteImage(targetRepo, dockerRepository, tag, copy);
   }
}
