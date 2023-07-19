/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.crd.generator.visitor;

import io.fabric8.kubernetes.model.annotation.PrinterColumn;

import java.util.ArrayList;

@Deprecated
public class DeprecatedAdditionalPrinterColumnDetector extends AnnotatedMultiPropertyPathDetector {

  public DeprecatedAdditionalPrinterColumnDetector() {
    this(DOT);
  }

  public DeprecatedAdditionalPrinterColumnDetector(String prefix) {
    super(prefix, PrinterColumn.class.getSimpleName(), new ArrayList<>());
  }
}
