/**
 * Copyright (C) 2012-2015 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.sos.ds.hibernate.entities.series.values;

import org.n52.sos.ds.hibernate.entities.series.Series;
import org.n52.sos.ds.hibernate.entities.series.HibernateSeriesRelations.HasSeries;
import org.n52.sos.ds.hibernate.entities.values.AbstractValue;

/**
 * Implementation of {@link AbstractValue} for series concept used in streaming
 * datasource
 * 
 * @author Carsten Hollmann <c.hollmann@52north.org>
 * @since 4.1.0
 *
 */
public class SeriesValue extends AbstractValue implements HasSeries {

    private static final long serialVersionUID = -2757686338936995366L;
    
    private Series series;

    @Override
    public Series getSeries() {
        return series;
    }

    @Override
    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public boolean isSetSeries() {
        return getSeries() != null;
    }
}
