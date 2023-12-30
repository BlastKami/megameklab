/*
 * Copyright (c) 2023 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMekLab.
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MegaMek. If not, see <http://www.gnu.org/licenses/>.
 */
package megameklab.ui.generalUnit.summary;

import javax.swing.*;

public abstract class AbstractSummaryItem implements SummaryItem {

    protected final JLabel weightLabel = new SummaryWeightLabel("");
    protected final JLabel critLabel = new SummaryWeightLabel("");
    protected final JLabel availabilityLabel = new SummaryAvailabilityLabel("");

    @Override
    public JComponent getWeightComponent() {
        return weightLabel;
    }

    @Override
    public JComponent getCritsComponent() {
        return critLabel;
    }

    @Override
    public JComponent getAvailabilityComponent() {
        return availabilityLabel;
    }
}