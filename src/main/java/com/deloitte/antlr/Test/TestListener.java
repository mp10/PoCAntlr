// Generated from Test.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TestParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TestParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TestParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TestParser.TypeContext ctx);
}