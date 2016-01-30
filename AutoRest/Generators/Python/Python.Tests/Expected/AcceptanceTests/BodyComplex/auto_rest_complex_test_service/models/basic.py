# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class Basic(Model):

    _required = []

    _attribute_map = {
        'id': {'key': 'id', 'type': 'int'},
        'name': {'key': 'name', 'type': 'str'},
        'color': {'key': 'color', 'type': 'CMYKColors'},
    }

    def __init__(self, *args, **kwargs):
        """Basic

        :param int id
        :param str name
        :param str color: Possible values for this property include: 'cyan',
        'Magenta', 'YELLOW', 'blacK'.
        """
        self.id = None
        self.name = None
        self.color = None

        super(Basic, self).__init__(*args, **kwargs)