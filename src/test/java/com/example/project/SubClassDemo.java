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

@Execution(ExecutionMode.CONCURRENT)
class SubClassDemo extends SingleClassDemo {

    @Test
    void subTest1() {
        logTestName();
        delay();
    }
 
    @Test
    @Tag("slow")
    void subTest2() {
        logTestName();
        delay();
        assumeTrue(2 > 3);
    }

    @Test
    void subTest3() {
        delay();
        fail(getFailMessage());
    }

    @Disabled("Ignored message for demo purposes")
    @Test
    void subTest4() {
        logSkipTest();
        delay();
    }
}
