/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.merge;

import java.util.List;

import io.proleap.cobol.Cobol85Parser.MergeCollatingSequencePhraseContext;
import io.proleap.cobol.Cobol85Parser.MergeGivingPhraseContext;
import io.proleap.cobol.Cobol85Parser.MergeOnKeyClauseContext;
import io.proleap.cobol.Cobol85Parser.MergeOutputProcedurePhraseContext;
import io.proleap.cobol.Cobol85Parser.MergeUsingContext;
import io.proleap.cobol.asg.metamodel.call.Call;
import io.proleap.cobol.asg.metamodel.procedure.Statement;

/**
 * Merges two or more identically sequenced files by specified keys.
 */
public interface MergeStatement extends Statement {

	CollatingSequencePhrase addCollatingSequencePhrase(MergeCollatingSequencePhraseContext ctx);

	GivingPhrase addGiving(MergeGivingPhraseContext ctx);

	OnKey addOnKey(MergeOnKeyClauseContext ctx);

	OutputProcedurePhrase addOutputProcedurePhrase(MergeOutputProcedurePhraseContext ctx);

	UsingPhrase addUsingPhrase(MergeUsingContext ctx);

	CollatingSequencePhrase getCollatingSequencePhrase();

	Call getFileCall();

	List<GivingPhrase> getGivingPhrases();

	List<OnKey> getOnKeys();

	OutputProcedurePhrase getOutputProcedurePhrase();

	List<UsingPhrase> getUsingPhrases();

	void setFileCall(Call fileCall);

}
