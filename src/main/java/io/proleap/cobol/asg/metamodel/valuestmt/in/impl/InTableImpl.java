/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.valuestmt.in.impl;

import io.proleap.cobol.Cobol85Parser.InTableContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.asg.metamodel.valuestmt.in.InTable;

public class InTableImpl extends CobolDivisionElementImpl implements InTable {

	protected InTableContext ctx;

	public InTableImpl(final ProgramUnit programUnit, final InTableContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

}