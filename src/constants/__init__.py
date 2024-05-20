def EXCL(Set, element):
    Set.m_value.discard(element)


def INCL(Set, element):
    Set.m_value.add(element)



def DEC(operand, decrement=None):
    if decrement is None:
        operand.m_value -= 1
    else:
        operand.m_value -= decrement


