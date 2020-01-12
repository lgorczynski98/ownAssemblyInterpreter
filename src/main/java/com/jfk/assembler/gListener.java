package com.jfk.assembler;// Generated from C:/Users/lgorczynski98/OneDrive - Wojskowa Akademia Techniczna/Materialy_FTP/Semestr 5/JFK/insterpreterAssemblera/assemblyInterpreter\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#int0x80}.
	 * @param ctx the parse tree
	 */
	void enterInt0x80(gParser.Int0x80Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#int0x80}.
	 * @param ctx the parse tree
	 */
	void exitInt0x80(gParser.Int0x80Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(gParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(gParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(gParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(gParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(gParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(gParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(gParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(gParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(gParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(gParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(gParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(gParser.OperandContext ctx);
}