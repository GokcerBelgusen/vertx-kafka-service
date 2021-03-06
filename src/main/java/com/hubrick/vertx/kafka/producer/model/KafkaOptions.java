/**
 * Copyright (C) 2016 Etaia AS (oss@hubrick.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hubrick.vertx.kafka.producer.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;

/**
 * @author Emir Dizdarevic
 * @since 1.0.0
 */
@DataObject
public class KafkaOptions {

    public static final String TOPIC = "topic";

    private String topic;

    public KafkaOptions() {}

    public KafkaOptions(KafkaOptions kafkaOptions) {
        this.topic = kafkaOptions.getTopic();
    }

    public KafkaOptions(JsonObject jsonObject) {
        this.topic = jsonObject.getString(TOPIC);
    }

    public String getTopic() {
        return topic;
    }

    @Fluent
    public KafkaOptions setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public JsonObject toJson() {
        final JsonObject jsonObject = new JsonObject();
        if(topic != null) {
            jsonObject.put(TOPIC, topic);
        }
        return jsonObject;
    }
}
