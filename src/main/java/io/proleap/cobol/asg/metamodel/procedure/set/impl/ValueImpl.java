/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.set.impl;

import io.proleap.cobol.Cobol85Parser.SetToValueContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.asg.metamodel.procedure.set.Value;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public class ValueImpl extends CobolDivisionElementImpl implements Value {

	protected SetToValueContext ctx;

	protected ValueStmt valueStmt;

	protected ValueType valueType;

	public ValueImpl(final ProgramUnit programUnit, final SetToValueContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public ValueStmt getValueStmt() {
		return valueStmt;
	}

	@Override
	public ValueType getValueType() {
		return valueType;
	}

	@Override
	public void setValueStmt(final ValueStmt valueStmt) {
		this.valueStmt = valueStmt;
	}

	@Override
	public void setValueType(final ValueType valueType) {
		this.valueType = valueType;
	}

}
