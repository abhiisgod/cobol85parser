/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.environment.inputoutput.filecontrol.impl;

import io.proleap.cobol.Cobol85Parser.AssignClauseContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.environment.inputoutput.filecontrol.AssignClause;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public class AssignClauseImpl extends CobolDivisionElementImpl implements AssignClause {

	protected AssignClauseType assignClauseType;

	protected final AssignClauseContext ctx;

	protected ValueStmt toValueStmt;

	public AssignClauseImpl(final ProgramUnit programUnit, final AssignClauseContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public AssignClauseType getAssignClauseType() {
		return assignClauseType;
	}

	@Override
	public ValueStmt getToValueStmt() {
		return toValueStmt;
	}

	@Override
	public void setAssignClauseType(final AssignClauseType assignClauseType) {
		this.assignClauseType = assignClauseType;
	}

	@Override
	public void setToValueStmt(final ValueStmt toValueStmt) {
		this.toValueStmt = toValueStmt;
	}
}
