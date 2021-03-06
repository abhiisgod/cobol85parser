/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.visitor.impl;

import org.antlr.v4.runtime.tree.ParseTree;

import io.proleap.cobol.Cobol85Parser;
import io.proleap.cobol.asg.metamodel.Program;
import io.proleap.cobol.asg.metamodel.environment.EnvironmentDivision;
import io.proleap.cobol.asg.util.ANTLRUtils;

/**
 * Visitor for analyzing declarations in the AST.
 */
public class CobolEnvironmentDivisionVisitorImpl extends AbstractCobolParserVisitorImpl {

	public CobolEnvironmentDivisionVisitorImpl(final Program program) {
		super(program);
	}

	protected EnvironmentDivision findEnvironmentDivision(final ParseTree ctx) {
		return ANTLRUtils.findParent(EnvironmentDivision.class, ctx, program.getASGElementRegistry());
	}

	@Override
	public Boolean visitConfigurationSection(final Cobol85Parser.ConfigurationSectionContext ctx) {
		final EnvironmentDivision environmentDivision = findEnvironmentDivision(ctx);

		environmentDivision.addConfigurationSection(ctx);

		return visitChildren(ctx);
	}

	@Override
	public Boolean visitInputOutputSection(final Cobol85Parser.InputOutputSectionContext ctx) {
		final EnvironmentDivision environmentDivision = findEnvironmentDivision(ctx);

		environmentDivision.addInputOutputSection(ctx);

		return visitChildren(ctx);
	}

	@Override
	public Boolean visitSpecialNamesParagraph(final Cobol85Parser.SpecialNamesParagraphContext ctx) {
		final EnvironmentDivision environmentDivision = findEnvironmentDivision(ctx);

		environmentDivision.addSpecialNamesParagraph(ctx);

		return visitChildren(ctx);
	}
}
