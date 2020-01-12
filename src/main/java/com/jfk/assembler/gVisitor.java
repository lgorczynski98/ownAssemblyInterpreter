package com.jfk.assembler;// Generated from C:/Users/lgorczynski98/OneDrive - Wojskowa Akademia Techniczna/Materialy_FTP/Semestr 5/JFK/insterpreterAssemblera/assemblyInterpreter\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(gParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(gParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#int0x80}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt0x80(gParser.Int0x80Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(gParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(gParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(gParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(gParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(gParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(gParser.OperandContext ctx);
}