/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.valuestmt.relation;

import io.proleap.cobol.asg.metamodel.valuestmt.ArithmeticValueStmt;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public interface SignCondition extends ValueStmt {

	enum SignConditionType {
		NEGATIVE, POSITIVE, ZERO
	}

	ArithmeticValueStmt getArithmeticExpression();

	SignConditionType getSignConditionType();

	void setArithmeticExpression(ArithmeticValueStmt arithmeticExpression);

	void setSignConditionType(SignConditionType signConditionType);

}
