package com.jfk.assembler;

public class Visitor<T> extends gBaseVisitor<T>{

    private Calculator calculator;
    private CurrentInstruction currentInstruction;
    private CurrentRegister currentRegister;

    public Visitor(Calculator calculator){
        this.calculator = calculator;
        this.currentInstruction = CurrentInstruction.WRONG;
        this.currentRegister = CurrentRegister.WRONG;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStart(gParser.StartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExpr(gParser.ExprContext ctx) {
        try {
            switch(ctx.REGISTER().getText()){
                case "%eax":{
                    currentRegister = CurrentRegister.EAX;
                    break;
                }
                case "%ebx":{
                    currentRegister = CurrentRegister.EBX;
                    break;
                }
                case "%ecx":{
                    currentRegister = CurrentRegister.ECX;
                    break;
                }
                case "%edx":{
                    currentRegister = CurrentRegister.EDX;
                    break;
                }
                default:
                    currentRegister = CurrentRegister.WRONG;
            }
        }
        catch(Exception e) {
            currentRegister = CurrentRegister.WRONG;
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInt0x80(gParser.Int0x80Context ctx) {
        currentInstruction = CurrentInstruction.INT;
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPush(gParser.PushContext ctx) {
        currentInstruction = CurrentInstruction.PUSH;
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMov(gParser.MovContext ctx) {
        currentInstruction = CurrentInstruction.MOV;
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitXor(gParser.XorContext ctx) {
        currentInstruction = CurrentInstruction.XOR;
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitOperation(gParser.OperationContext ctx) {
        calculator.setExpresion(ctx.getText());
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTerm(gParser.TermContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFactor(gParser.FactorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitOperand(gParser.OperandContext ctx) { return visitChildren(ctx); }

    public CurrentInstruction getCurrentInstruction() {
        return currentInstruction;
    }

    public CurrentRegister getCurrentRegister() {
        return currentRegister;
    }
}
