/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.data.report;

import io.proleap.cobol.asg.metamodel.CobolDivisionElement;
import io.proleap.cobol.asg.metamodel.IntegerLiteral;

public interface LineNumberClause extends CobolDivisionElement {

	enum LineNumberClauseType {
		NEXT_PAGE, PLUS
	}

	IntegerLiteral getIntegerLiteral();

	LineNumberClauseType getLineNumberClauseType();

	void setIntegerLiteral(IntegerLiteral integerLiteral);

	void setLineNumberClauseType(LineNumberClauseType lineNumberClauseType);

}
