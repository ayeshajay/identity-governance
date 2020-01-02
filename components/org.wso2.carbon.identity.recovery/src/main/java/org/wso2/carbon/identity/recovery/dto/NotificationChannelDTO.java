/*
 *
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.recovery.dto;

/**
 * Object that encapsulates the verified notification channels of the user.
 */
public class NotificationChannelDTO {

    /**
     * Channel id to recognize the channel at verification.
     */
    private int id;

    /**
     * Type of the notification channel. Eg: EMAIL
     */
    private String type;

    /**
     * Value associated with the channel. Eg: test@wso2.com
     * NOTE: This value can be encoded. Eg: tes**********
     */
    private String value;

    /**
     * Whether the channel is user's preferred channel.
     */
    private boolean preferred;

    /**
     * Get the notification channel Id.
     *
     * @return Channel Id
     */
    public int getId() {

        return id;
    }

    /**
     * Set the notification channel Id.
     *
     * @param id Channel Id for the notification channel.
     */
    public void setId(int id) {

        this.id = id;
    }

    /**
     * Get the notification channel type.
     *
     * @return Notification channel type
     */
    public String getType() {

        return type;
    }

    /**
     * Set the notification channel type.
     *
     * @param type Notification channel type
     */
    public void setType(String type) {

        this.type = type;
    }

    /**
     * Get the value of the notification channel.
     *
     * @return Notification channel value
     */
    public String getValue() {

        return value;
    }

    /**
     * Set the value of the notification channel.
     *
     * @param value Value of the notification channel
     */
    public void setValue(String value) {

        this.value = value;
    }

    /**
     * Whether the notification channel is preferred by the user.
     *
     * @return True of the user has set the channel as a preferred channel.
     */
    public boolean isPreferred() {

        return preferred;
    }

    /**
     * Set the notification channel preferred status.
     *
     * @param preferred True if the user prefers the notification channel
     */
    public void setPreferred(boolean preferred) {

        this.preferred = preferred;
    }
}
