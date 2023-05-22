/*
 *  Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *
 */

package org.eclipse.tractusx.edc.tests.edr;

import org.eclipse.edc.junit.annotations.PostgresqlDbIntegrationTest;
import org.eclipse.tractusx.edc.lifecycle.PgParticipantRuntime;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.eclipse.tractusx.edc.lifecycle.TestRuntimeConfiguration.PLATO_BPN;
import static org.eclipse.tractusx.edc.lifecycle.TestRuntimeConfiguration.PLATO_NAME;
import static org.eclipse.tractusx.edc.lifecycle.TestRuntimeConfiguration.SOKRATES_BPN;
import static org.eclipse.tractusx.edc.lifecycle.TestRuntimeConfiguration.SOKRATES_NAME;
import static org.eclipse.tractusx.edc.lifecycle.TestRuntimeConfiguration.platoPostgresqlConfiguration;
import static org.eclipse.tractusx.edc.lifecycle.TestRuntimeConfiguration.sokratesPostgresqlConfiguration;

@PostgresqlDbIntegrationTest
public class NegotiateEdrPostgresqlTest extends AbstractNegotiateEdrTest {

    @RegisterExtension
    protected static PgParticipantRuntime SOKRATES_RUNTIME = new PgParticipantRuntime(
            ":edc-tests:runtime:runtime-postgresql",
            SOKRATES_NAME,
            SOKRATES_BPN,
            sokratesPostgresqlConfiguration()
    );
    @RegisterExtension
    protected static PgParticipantRuntime PLATO_RUNTIME = new PgParticipantRuntime(
            ":edc-tests:runtime:runtime-postgresql",
            PLATO_NAME,
            PLATO_BPN,
            platoPostgresqlConfiguration()
    );
}
