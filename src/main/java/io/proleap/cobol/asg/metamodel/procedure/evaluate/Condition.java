/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.evaluate;

import io.proleap.cobol.Cobol85Parser.EvaluateThroughContext;
import io.proleap.cobol.Cobol85Parser.EvaluateValueContext;
import io.proleap.cobol.asg.metamodel.CobolDivisionElement;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public interface Condition extends CobolDivisionElement {

	enum ConditionType {
		ANY, BOOLEAN, CONDITION, VALUE, VALUE_THROUGH
	}

	Through addThrough(EvaluateThroughContext ctx);

	Value addValue(EvaluateValueContext ctx);

	ConditionType getConditionType();

	ValueStmt getConditionValueStmt();

	Through getThrough();

	Value getValue();

	boolean isNot();

	void setConditionType(ConditionType conditionType);

	void setConditionValueStmt(ValueStmt conditionValueStmt);

	void setNot(boolean not);
}
