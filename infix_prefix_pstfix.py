def infix_to_prefix(expression):
    """Algorithm for Infix to Prefix:
           Traverse the infix expression and check if given character is an operator or an operand.
           If it is an operand, then push it into operand stack.
           If it is an operator, then check if priority of current operator is greater than or less than or equal to the operator at top of the stack.
           If priority is greater, then push operator into operator stack. Otherwise pop two operands from operand stack, pop operator from operator stack and push string operator + operand1 + operand 2 into operand stack.
           Keep popping from both stacks and pushing result into operand stack until priority of current operator is less than or equal to operator at top of the operator stack.
           If current character is ‘(‘, then push it into operator stack.
           If current character is ‘)’, then check if top of operator stack is opening bracket or not.If not pop two operands from operand stack, pop operator from operator stack and push string operator + operand1 +                operand 2 into operand stack.
           Keep popping from both stacks and pushing result into operand stack until top of operator stack is an opening bracket.
           The final prefix expression is present at top of operand stack."""

    infix = expression
    operators_stack = []
    operands = []
    operators = {'(':1, ')':1, '+':2, '-':2, '*':3, '/':3, '^':4}
    for i in range(len(infix)):
        if (infix[i] == '('):
                operators_stack.append(infix[i])
        elif (infix[i] == ')'):
            operators_stack.pop()
            while (len(operators_stack) > 0 and operators_stack[-1] != '('):
                op1 = operands[-1]
                operands.pop()
                op2 = operands[-1]
                operands.pop()
                op = operators_stack[-1]
                operators_stack.pop()
                tmp = op + op2 + op1
                operands.append(tmp)
        elif i not in operators.keys():
            operands.append(infix[i])
        else:
            while (len(operators_stack) > 0 and operators[infix[i]] <= operators[operators_stack[-1]]):
                op1 = operands[-1]
                operands.pop()
                op2 = operands[-1]
                operands.pop()
                op = operators_stack[-1]
                operators_stack.pop()
                tmp = op + op2 + op1
                operands.append(tmp)
            operators_stack.append(infix[i])

    while len(operators_stack) > 0:
        op1 = operands[-1]
        operands.pop()
        op2 = operands[-1]
        operands.pop()
        op = operators_stack[-1]
        operators_stack.pop()
        tmp = op + op2 + op1
        operands.append(tmp)
    return operands


def prefix_to_postfix(expression):
    """Algorithm for Prefix to Postfix:

        Read the Prefix expression in reverse order (from right to left)
        If the symbol is an operand, then push it onto the Stack
        If the symbol is an operator, then pop two operands from the Stack
        Create a string by concatenating the two operands and the operator after them.
        string = operand1 + operand2 + operator
        And push the resultant string back to Stack
        Repeat the above steps until end of Prefix expression."""

    # input prefix expression
    exprstn = expression

    # Stack to push operands
    stack = []

    # Operators set
    operators = set(['+','-','*','/','^'])
    #reversing the string
    exprstn = exprstn[::-1]

    for i in exprstn:
        if i in operators:
            a = stack.pop()
            b = stack.pop()
            temp = a+b+i
            stack.append(temp)
        else: stack.append(i)
    return stack;

def postfix_to_prefix(expression):

    """ Algorithm for Postfix to Prefix:
        Read the Postfix expression from left to right
        If the symbol is an operand, then push it onto the Stack
        If the symbol is an operator, then pop two operands from the Stack
        Create a string by concatenating the two operands and the operator before them.
        string = operator + operand2 + operand1
        And push the resultant string back to Stack
        Repeat the above steps until end of Prefix expression."""

    # input postfix expression
    exprstn = expression
    stack2 = []
    operators = set(['+','-','*','/','^'])
    
    for i in exprstn:
        if i in operators:
            op1 = stack2.pop()
            op2 = stack2.pop()
            temp = i + op2 + op1
            stack2.append(temp)
        else:
            stack2.append(i)

    return stack2;


prefix = "*-A/BC-/AKL"
#print(prefix_to_postfix(prefix))
postfix = "ABC/-AK/L-*"
#print(postfix_to_prefix(postfix))
infix = "(A+B) * (C-D)"
print(*infix_to_prefix(infix))
