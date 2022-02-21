package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url '/footballs'
        headers {
            contentType('application/json')
        }
        body([
                yell: $(regex(nonEmpty()))
        ])
    }

    response {
        status OK()
        headers {
            contentType('application/json')
        }
        body([
                message: $(consumer("imma-stub"), producer(regex(nonEmpty()))),
                status : "In Northern we Trust..."
        ])
    }
}
