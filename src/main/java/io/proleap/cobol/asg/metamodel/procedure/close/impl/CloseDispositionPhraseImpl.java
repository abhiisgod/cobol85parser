/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.close.impl;

import io.proleap.cobol.Cobol85Parser.ClosePortFileIOUsingCloseDispositionContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.asg.metamodel.procedure.close.CloseDispositionPhrase;

public class CloseDispositionPhraseImpl extends CobolDivisionElementImpl implements CloseDispositionPhrase {

	protected ClosePortFileIOUsingCloseDispositionContext ctx;

	protected UsingCloseDispositionType usingCloseDispositionType;

	public CloseDispositionPhraseImpl(final ProgramUnit programUnit,
			final ClosePortFileIOUsingCloseDispositionContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public UsingCloseDispositionType getUsingCloseDispositionType() {
		return usingCloseDispositionType;
	}

	@Override
	public void setUsingCloseDispositionType(final UsingCloseDispositionType usingCloseDispositionType) {
		this.usingCloseDispositionType = usingCloseDispositionType;
	}

}
