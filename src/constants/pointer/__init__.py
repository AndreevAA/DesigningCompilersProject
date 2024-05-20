class Pointer:
    def __init__(self, initialValue):
        self.m_pValue = initialValue
        self.m_value = None


def NEW(pointer):
    pointer.m_value = pointer.m_pValue()
