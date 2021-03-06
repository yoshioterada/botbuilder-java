/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SuggestedActions that can be performed.
 */
public class SuggestedActions {
    /**
     * Ids of the recipients that the actions should be shown to.  These Ids
     * are relative to the channelId and a subset of all recipients of the
     * activity.
     */
    @JsonProperty(value = "to")
    private List<String> to;

    /**
     * Actions that can be shown to the user.
     */
    @JsonProperty(value = "actions")
    private List<CardAction> actions;

    /**
     * Get the to value.
     *
     * @return the to value
     */
    public List<String> to() {
        return this.to;
    }

    /**
     * Set the to value.
     *
     * @param to the to value to set
     * @return the SuggestedActions object itself.
     */
    public SuggestedActions withTo(List<String> to) {
        this.to = to;
        return this;
    }

    /**
     * Get the actions value.
     *
     * @return the actions value
     */
    public List<CardAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions value.
     *
     * @param actions the actions value to set
     * @return the SuggestedActions object itself.
     */
    public SuggestedActions withActions(List<CardAction> actions) {
        this.actions = actions;
        return this;
    }

}
