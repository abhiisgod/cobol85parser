/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.call.impl;

import org.antlr.v4.runtime.ParserRuleContext;

import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.call.ReportCall;
import io.proleap.cobol.asg.metamodel.data.report.ReportDescription;
import io.proleap.cobol.asg.metamodel.type.Type;

public class ReportCallImpl extends CallImpl implements ReportCall {

	protected final CallType callType = CallType.REPORT_DESCRIPTION_CALL;

	protected ReportDescription report;

	public ReportCallImpl(final String name, final ReportDescription report, final ProgramUnit programUnit,
			final ParserRuleContext ctx) {
		super(name, programUnit, ctx);

		this.report = report;
	}

	@Override
	public CallType getCallType() {
		return callType;
	}

	@Override
	public ReportDescription getReport() {
		return report;
	}

	@Override
	public Type getType() {
		return null;
	}

	@Override
	public String toString() {
		return super.toString() + ", report=[" + report + "]";
	}
}
