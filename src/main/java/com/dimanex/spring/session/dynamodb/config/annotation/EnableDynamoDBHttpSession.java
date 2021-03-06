/*
 * Copyright 2017 DiManEx B.V. . All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.dimanex.spring.session.dynamodb.config.annotation;

import com.dimanex.spring.session.dynamodb.config.DynamoDBSessionRepositoryConfiguration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(DynamoDBSessionRepositoryConfiguration.class)
public @interface EnableDynamoDBHttpSession {

    int maxInactiveIntervalInSeconds() default DynamoDBSessionRepositoryConfiguration.MAX_INACTIVE_INTERVAL_IN_SECONDS;

    String sesstionsTableName() default DynamoDBSessionRepositoryConfiguration.SESSIONS_TABLE_NAME;

}
