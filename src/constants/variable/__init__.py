class Variable:
    def __init__(self, initialValue):
        self.m_value = initialValue

def INC(var, increment=None):
    if increment is None:
        var.m_value += 1
    else:
        var.m_value += increment


def SHORT(var):
    return var


def ASH(var, shiftPos):
    var = var << shiftPos
    return var


def ODD(var):
    if (var % 2) == 0:
        return False
    else:
        return True
