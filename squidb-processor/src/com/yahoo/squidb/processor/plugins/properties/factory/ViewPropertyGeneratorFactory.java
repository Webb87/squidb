/*
 * Copyright 2015, Yahoo Inc.
 * Copyrights licensed under the Apache 2.0 License.
 * See the accompanying LICENSE file for terms.
 */
package com.yahoo.squidb.processor.plugins.properties.factory;

import com.yahoo.aptutils.model.DeclaredTypeName;
import com.yahoo.aptutils.utils.AptUtils;
import com.yahoo.squidb.annotations.ViewModelSpec;
import com.yahoo.squidb.processor.data.ModelSpec;

import javax.lang.model.element.VariableElement;

public class ViewPropertyGeneratorFactory extends FieldReferencePropertyGeneratorFactory {

    public ViewPropertyGeneratorFactory(ModelSpec<?> modelSpec, AptUtils utils) {
        super(modelSpec, utils);
    }

    @Override
    public boolean hasPropertyGeneratorForField(VariableElement field, DeclaredTypeName fieldType) {
        return super.hasPropertyGeneratorForField(field, fieldType)
                && modelSpec.getModelSpecElement().getAnnotation(ViewModelSpec.class) != null;
    }

}
