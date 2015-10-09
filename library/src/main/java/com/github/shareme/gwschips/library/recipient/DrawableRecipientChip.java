/*
 * Copyright (C) 2011 The Android Open Source Project
 * Modifications Copyright (C) 2105 Fred Grott(GrottWorkShop)
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
package com.github.shareme.gwschips.library.recipient;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * RecipientChip defines a drawable object that contains information relevant to a
 * particular recipient.
 * Created by fgrott on 8/28/2015.
 */
@SuppressWarnings("unused")
public interface DrawableRecipientChip extends BaseRecipientChip {
    /**
     * Get the bounds of the chip; may be 0,0 if it is not visibly rendered.
     */
    Rect getBounds();

    /**
     * Draw the chip.
     */
    void draw(Canvas canvas);
}
