/*
 * Copyright (C) 2012 Soomla Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.soomla.store.events;

import com.soomla.store.domain.virtualGoods.VirtualGood;

/**
 * This event is fired when the balance of a specific VirtualGood has changed.
 *
 * Real Game Example:
 *  Example Inventory: { currency_coin: 100, green_hat: 3, blue_hat: 5 }
 *  Suppose your user buys something for 4 "blue_hat"s.
 *  His new balance of "blue_hat" will now be 1.
 *  A GoodBalanceChangedEvent is fired.
 */
public class GoodBalanceChangedEvent {

    /**
     * Constructor
     *
     * @param good
     * @param balance
     * @param amountAdded
     */
    public GoodBalanceChangedEvent(VirtualGood good, int balance, int amountAdded) {
        mGood = good;
        mBalance = balance;
        mAmountAdded = amountAdded;
    }


    /** Setters and Getters */

    public VirtualGood getGood() {
        return mGood;
    }

    public int getBalance() {
        return mBalance;
    }

    public int getAmountAdded() {
        return mAmountAdded;
    }


    /** Private Members */

    private VirtualGood mGood;

    private int mBalance;

    private int mAmountAdded;

}
