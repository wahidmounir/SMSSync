/*
 * Copyright (c) 2010 - 2015 Ushahidi Inc
 * All rights reserved
 * Contact: team@ushahidi.com
 * Website: http://www.ushahidi.com
 * GNU Lesser General Public License Usage
 * This file may be used under the terms of the GNU Lesser
 * General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.LGPL included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU Lesser General Public License version 3 requirements
 * will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 */

package org.addhen.smssync.data.repository.datasource.webservice;

import com.ushahidi.android.data.database.DeploymentDatabaseHelper;

import android.support.annotation.NonNull;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * A factory class for creating the different datasource for {@link com.ushahidi.android.data.entity.DeploymentEntity}
 *
 * @author Ushahidi Team <team@ushahidi.com>
 */
@Singleton
public class WebServiceDataSourceFactory {

    private final DeploymentDatabaseHelper mDeploymentDatabaseHelper;

    /**
     * Default constructor that constructs {@link WebServiceDataSourceFactory}
     *
     * @param deploymentDatabaseHelper The deployment database helper
     */
    @Inject
    WebServiceDataSourceFactory(@NonNull DeploymentDatabaseHelper deploymentDatabaseHelper) {
        mDeploymentDatabaseHelper = deploymentDatabaseHelper;
    }

    /**
     * Creates {@link DeploymentDatabaseDataSource}
     *
     * @return The deployment database source
     */
    public WebServiceDataSource createDatabaseDataSource() {
        return new DeploymentDatabaseDataSource(mDeploymentDatabaseHelper);
    }
}
