package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method 'GET'
		url '/status'
	}
	response {
		status 200
		body( """
			{
				"status": "OK"
			}
		""")
	}
}
