/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.add;

import io.proleap.cobol.Cobol85Parser.AddCorrespondingStatementContext;
import io.proleap.cobol.Cobol85Parser.AddToGivingStatementContext;
import io.proleap.cobol.Cobol85Parser.AddToStatementContext;
import io.proleap.cobol.asg.metamodel.procedure.NotOnSizeErrorPhrase;
import io.proleap.cobol.asg.metamodel.procedure.OnSizeErrorPhrase;
import io.proleap.cobol.asg.metamodel.procedure.Statement;

/**
 * Adds two or more numeric operands and stores the result.
 */
public interface AddStatement extends Statement {

	enum AddType {
		CORRESPONDING, TO_GIVING, TO
	}

	AddCorrespondingStatement addAddCorrespondingStatement(AddCorrespondingStatementContext ctx);

	AddToGivingStatement addAddToGivingStatement(AddToGivingStatementContext ctx);

	AddToStatement addAddToStatement(AddToStatementContext ctx);

	AddCorrespondingStatement getAddCorrespondingStatement();

	AddToGivingStatement getAddToGivingStatement();

	AddToStatement getAddToStatement();

	AddType getAddType();

	NotOnSizeErrorPhrase getNotOnSizeErrorPhrase();

	OnSizeErrorPhrase getOnSizeErrorPhrase();

	void setAddType(AddType addType);

	void setNotOnSizePhrase(NotOnSizeErrorPhrase notOnSizeErrorPhrase);

	void setOnSizeErrorPhrase(OnSizeErrorPhrase onSizeErrorPhrase);
}
