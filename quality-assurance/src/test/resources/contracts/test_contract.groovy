package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method 'GET'
		url '/persons/count'
	}
	response {
		status 200
		body( """
			{
				"count": 2
			}
		""")
	}
}
