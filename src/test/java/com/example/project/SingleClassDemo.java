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

@Tag("fast")
@Execution(ExecutionMode.CONCURRENT)
class SingleClassDemo extends TestFactory {

    @Test
    void test1() {
        logTestName();
        delay();
    }
 
    @Test
    @Tag("slow")
    void test2() {
        logTestName();
        delay();
    }

    @Test
    void test3() {
        delay();
        fail(getFailMessage());
    }

    @Disabled("Ignored message for demo purposes")
    @Test
    void test4() {
        logSkipTest();
        delay();
    }
}