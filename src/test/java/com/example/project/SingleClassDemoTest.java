/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Tag("fast")
@Execution(ExecutionMode.CONCURRENT)
class SingleClassDemoTest extends TestFactory {

    @Test
    void test1() {
        logTestName();
    }

    @Tag("slow")
    @Test
    void test2() {
        logTestName();
        delay();
        assumeTrue(2 > 3);
    }

    @Test
    void test3() {
        fail(getFailMessage());
    }

    @Disabled("Ignored message for demo purposes")
    @Test
    void test4() {
        logSkipTest();
    }
}